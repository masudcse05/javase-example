module com.mhaque.mainppmodule {
    
    requires com.mhaque.entitymodule;
    requires com.mhaque.daomodule;
    requires com.mhaque.userdaomodule;
    uses com.mhaque.userdaomodule.UserDao;  
    
}
