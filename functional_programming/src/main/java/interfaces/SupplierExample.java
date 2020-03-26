package interfaces;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        System.out.println(getDbUrl());
        System.out.println(getDbUrlSupplier.get());
    }

    static String getDbUrl() {
        return "jdbc://localhost:3309/oauth_db";
    }

    static Supplier<String> getDbUrlSupplier = () -> "jdbc://localhost:3309/oauth_db";;
}
