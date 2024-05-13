public class Country {
    private String Code;
    private String Name;
    private String Continent;
    private String Region;


    public Country(String Code, String Name, String Continent, String Region) {
        this.Code = Code;
        this.Name = Name;
        this.Continent = Continent;
        this.Region = Region;

    }
}
/*Connection ct=null;
        DbHelper help = new DbHelper();
        Statement stmt=null;
        ResultSet rs;

        ArrayList<Country> countries=new ArrayList<>();


        try {

            help.getConnection();
            stmt=help.getConnection().createStatement();
            rs = stmt.executeQuery("SELECT Code, Name, Continent, Region FROM country");


            while (rs.next()) {
                countries.add(new Country(rs.getString("Code"), rs.getString("Name"), rs.getString("Continent"), rs.getString("Region")));


            }
            System.out.println(countries.size());

            System.out.println("Bağlantı başarılı!!");
        } catch (SQLException e) {
            help.showErrorMessage(e);
        }*/