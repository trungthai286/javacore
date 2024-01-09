import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class User {
    private String account, password, accountNumber, phoneNumber, address;
    double money;

    public User() {
    }

    public User(String account, String password, String accountNumber, String phoneNumber, String address, double money) {
        this.account = account;
        this.password = password;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.money = money;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", money=" + money +
                '}';
    }
    public static void convertUserToJsonFile(String fileName, List<User> userList) {
        try {

            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            Writer writer = Files.newBufferedWriter(Paths.get(fileName));

            gson.toJson(userList, writer);

            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<User> getUserlistFromJsonFile(String fileUser) {
        try {

            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(fileUser));

            User[] userLstGson = gson.fromJson(reader, User[].class);

            if (userLstGson == null) {
                return Collections.emptyList();
            } else {
                List<User> users = Arrays.asList(userLstGson);
                reader.close();
                return users;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
