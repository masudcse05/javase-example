package com.mhaque.hackerrank.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class CaesarCipherTest {

	@Test
	public void testCaesarCipher() {
		assertEquals("okffng-Qwvb", CaesarCipher.caesarCipher("middle-Outz", 2));
		assertEquals("fff.jkl.gh", CaesarCipher.caesarCipher("www.abc.xy", 87));
		assertEquals("!w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E", CaesarCipher.caesarCipher("!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U", 62));
	}

}
