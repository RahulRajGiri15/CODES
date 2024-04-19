class objref {
    String color;
    int age;
    public static void main(String[] args) {
        System.out.println("1");
    
        objref cat=new objref();
        cat.color="green";
        cat.age=10;
        System.out.println(cat.color+" "+cat.age);
    }
}