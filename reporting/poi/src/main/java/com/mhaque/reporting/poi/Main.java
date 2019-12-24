/**
 * Created by @authoer haquem on Dec 24, 2019 
 */
package com.mhaque.reporting.poi;

import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author haquem
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException { 
		createWorkbook(false, ".xls");
        createWorkbook(true, ".xlsx");
	}
	
	private static void createWorkbook(boolean xssf, String extension) throws IOException {
        try (Workbook wb = WorkbookFactory.create(xssf)) {
            Sheet sheet = wb.createSheet("Cell comments in POI " + extension);
            CreationHelper creationHelper = wb.getCreationHelper();

            // Create the drawing patriarch. This is the top level container for all shapes including cell comments.
            Drawing<?> patr = sheet.createDrawingPatriarch();

            //create a cell in row 3
            Cell cell1 = sheet.createRow(3).createCell(1);
            cell1.setCellValue(creationHelper.createRichTextString("Hello, World"));

            //anchor defines size and position of the comment in worksheet
            ClientAnchor clientAnchor = creationHelper.createClientAnchor();
            clientAnchor.setCol1(4);
            clientAnchor.setRow1(2);
            clientAnchor.setCol2(6);
            clientAnchor.setRow2(5);
            Comment comment1 = patr.createCellComment(clientAnchor);

            // set text in the comment
            comment1.setString(creationHelper.createRichTextString("We can set comments in POI"));

            //set comment author.
            //you can see it in the status bar when moving mouse over the commented cell
            comment1.setAuthor("Apache Software Foundation");

            // The first way to assign comment to a cell is via Cell.setCellComment method
            cell1.setCellComment(comment1);

            //create another cell in row 6
            Cell cell2 = sheet.createRow(6).createCell(1);
            cell2.setCellValue(36.6);


            clientAnchor = creationHelper.createClientAnchor();
            clientAnchor.setCol1(4);
            clientAnchor.setRow1(8);
            clientAnchor.setCol2(6);
            clientAnchor.setRow2(11);
            Comment comment2 = patr.createCellComment(clientAnchor);
            //modify background color of the comment, only available in HSSF currently
            if (wb instanceof HSSFWorkbook) {
                ((HSSFComment) comment2).setFillColor(204, 236, 255);
            }

            RichTextString string = creationHelper.createRichTextString("Normal body temperature");

            //apply custom font to the text in the comment
            Font font = wb.createFont();
            font.setFontName("Arial");
            font.setFontHeightInPoints((short) 10);
            font.setBold(true);
            font.setColor(IndexedColors.RED.getIndex());
            string.applyFont(font);

            comment2.setString(string);
            comment2.setVisible(true); //by default comments are hidden. This one is always visible.

            comment2.setAuthor("Bill Gates");

            /*
             * The second way to assign comment to a cell is to implicitly specify its row and column.
             * Note, it is possible to set row and column of a non-existing cell.
             * It works, the comment is visible.
             */
            comment2.setRow(6);
            comment2.setColumn(1);

            try (FileOutputStream out = new FileOutputStream("poi_comment" + extension)) {
                wb.write(out);
            }
        }
    }

}
