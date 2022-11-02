public class Person {
    String name;
    String town;
    String jobTitle;
    int yearOfBirth;
    Person(String name,String town,int yearOfBirth,String jobTitle){
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }
    void greeting() {
        System.out.println( "Привет! Меня зовут " + name + "."+"Я из города " + town + "."+
                "Я родился(родилась) в " + yearOfBirth + " году. Я работаю на должности "
                + jobTitle + ". Будем знакомы!");
    }

}
