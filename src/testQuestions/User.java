package testQuestions;

public class User {
    private String name;
    private String companyName;
    private int year;
    private String email;
    private String password;

    public User(String name,String companyName,int year){
        this.name=name;
        this.companyName=companyName;
        this.year=year;
        this.email= createUserEmail();
        this.password= createUserPassword();
    }
    private String createUserPassword() {
        StringBuilder sb = new StringBuilder();
        sb.append(generateRandomCharacter());
        for(int i = 0; i < 4; i++){
        sb.append(generateRandomIntegerFromLimit(10));
        }
        sb.append(getFirst5CharactersFromUserName());
        sb.append(generateRandomSpecialSymbol(limit 1));
        return sb.toString();
    }
    private String createUserEmail(){
        return String.format("%s_%d@%s.com",
                getname().toLowerCase(), getYear(), getCompanyName());
    }

    private String getname() {
    }

    public String getName(){
        return name;
    }
    public String getCompanyName() {
        return companyName;
    }
    public int  getYear() {
        return year;
    }
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
         this.name = name;
     }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    }
    public void setYear(int year) {
        this.year = year;
    }

    public void setEmail(String password){
    this.password=password;
    }
    private  String getFirst5CharactersFromUserName(){
    if(getName().length()<5){
        int difference=5-getName().length();
        StringBuilder tempName=new StringBuilder((getName()));
        for(int i=0;i<difference;i++){
            tempName.append("0");
        }
        return getName().substring(0,5);
    }
    }
    private char generateRandomSpecialSymbol(int limit ){
    char[] specialSymbol=
            {
                    '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '{', '}', '[', ']', '|', '\\', '\'', '\"', '<', '>', '?', '.', ',', '/'
            }
    }
    int randomInteger=generateRandomIntegerFromLimit(SpecialSymbol.length);
        return SpecialSymbol[randomInteger];
                }

    private char generateRandomCharacter()};

    public String getPassword(){
        return password;

 public void setPassword(String password){
            this.password = password;
    }

    public String createUserEmail(){
        return String.format()

    public String getPassword(){
        return password;
    }
    public String getName {
            }

            private void setPassword(String password) {
        this.password = password;
    }

    public int generateRandomFromLimit(int limit){
        return (int)(Math.random() *limit);

        }
    }
    class User
}
