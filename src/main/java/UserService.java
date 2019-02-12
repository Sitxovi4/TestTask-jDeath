import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

class UserService {
    private static UserService instance = new UserService();
    private static JDBC jdbc = new JDBC();
    private static Connection connection = jdbc.getConnection();
    private static ArrayList<User> users = new ArrayList<User>();

    static void populateUsers() {
        User user;
        try {
            Statement statement1 = connection.createStatement();
            Statement statement2 = connection.createStatement();
            ResultSet userResultSet = statement1.executeQuery("SELECT * FROM user");
            ResultSet accountResultSet = statement2.executeQuery("SELECT account FROM account ORDER BY LENGTH(userId), userId ;"); //Костыль для сортировки по userId

            while (userResultSet.next() && accountResultSet.next()) {
                user = new User();
                user.setID(userResultSet.getInt("userId"));
                user.setNAME(userResultSet.getString("name"));
                user.setSURNAME(userResultSet.getString("surName"));
                user.setACCOUNT(accountResultSet.getInt("account"));
                users.add(user);
            }
            userResultSet.close();
            accountResultSet.close();
            statement1.close();
            statement2.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static UserService getInstance(){return instance;}

    public static ArrayList<User> getUsers(){return users;}

    static int getAccountsSum(){
        int sum =0;
        for (User user : users) {
            sum += user.getACCOUNT();
        }
        return sum;
    }

    static String getRichestUser() {
        User richest = new User();
        int max = users.get(0).getACCOUNT();
        for (User user : users) {
            if (user.getACCOUNT() > max) {
                max = user.getACCOUNT();
                richest = user;
            }
        }
        return richest.getNAME() + " " + richest.getSURNAME();
    }

    static User getUserById(int id) {
        int i;
        for (i = 0; i < users.size(); i++) {
            if (id == users.get(i).getID()) {
                break;
            }
        }
        return users.get(i);
    }

    static ArrayList getAllAccounts() {
        ArrayList<Integer> accountsList = new ArrayList<Integer>();
        for (User user : users) {
            accountsList.add(user.getACCOUNT());
        }
        return accountsList;
    }
//    static void getDataById(int id){
//            Statement statement;
//            try {
//                statement = jdbc.getConnection().createStatement();
//                ResultSet resultSet = statement.executeQuery("SELECT * FROM user where userId =" + id);
//
//                while (resultSet.next()){
//                    String name = resultSet.getString("name");
//                    String surName = resultSet.getString("surName");
//                    System.out.println(name + " " + surName );
//                }
//                resultSet.close();
//                statement.close();
//                jdbc.getConnection().close();
//
//            }catch (SQLException e){
//                e.printStackTrace();
//            }
//    }

//    static void getAllAccounts(){
//        Statement statement;
//        int account;
//        String name, surName;
//        try {
//
//            statement = jdbc.getConnection().createStatement();
//            ArrayList<String> accountList = new ArrayList<String>();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM user,account where user.userId = account.userId");
//
//            while (resultSet.next()){
//                account = resultSet.getInt("account");
//                name = resultSet.getString("name");
//                surName = resultSet.getString("surName");
//                accountList.add(name + " " + surName + " account: " + account);
//            }
//            for (int i = 0; i <accountList.size() ; i++) {
//                System.out.println(accountList.get(i));
//            }
//
//            resultSet.close();
//            statement.close();
//            jdbc.getConnection().close();
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//    }
}
