class Encapsulationn {
     private int empid;//data hideing
     public void setEmpid(int eid){ //setter method
        empid=eid;
     }
     public int getEmpid(){ // getter method
        return empid;
     }
}

class Company{
    public static void main(String[] args) {
        Encapsulationn e = new Encapsulationn();
        e.setEmpid(67);;
        System.out.println(e.getEmpid());
    }
}
