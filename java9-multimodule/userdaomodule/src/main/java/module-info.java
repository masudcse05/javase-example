module com.mhaque.userdaomodule {
    requires com.mhaque.entitymodule;
    requires com.mhaque.daomodule;
    provides com.mhaque.daomodule.Dao with com.mhaque.userdaomodule.UserDao;
    exports com.mhaque.userdaomodule;
}
