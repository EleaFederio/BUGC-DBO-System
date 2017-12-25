package sample.Utilities;

import sample.Systems.LoginController;

public class Generate {

    public String tableName(String toBeGenerate){
        String tableName;
        String tempTableName = toBeGenerate+ LoginController.userCourse;
        String subTableName = tempTableName.replace(" ", "");
        tableName = subTableName.replace("-", "_");
        return tableName;
    }
}
