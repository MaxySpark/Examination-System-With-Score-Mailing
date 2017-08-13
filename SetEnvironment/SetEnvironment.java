class SetEnvironment {
    public static void main(String[] args) {
        try{
            Runtime.getRuntime().exec("/opt/lampp/bin/mysql < database.sql");
            System.out.println("DB Initialized");
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
    }
}