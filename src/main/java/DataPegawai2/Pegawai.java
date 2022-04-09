package DataPegawai2;

/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class Pegawai {
    private int employeeID;
    private String name;
    private String department;
    private int gaji;

    public Pegawai(){
        this(210000,"-","-",0);    
    }
    public Pegawai( int employeeID,String name,String department,int gaji){
        if(employeeID<210000){
            this.employeeID = 210000;
        }
        else {
            this.employeeID = employeeID;
        }
        this.name = name;
        this.department = department;
        this.gaji = gaji;
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public void setEmployeeID(int employeeID){
        if(employeeID<210000){
            this.employeeID = 210000;
        }
        else {
            this.employeeID = employeeID;
        }
    }
    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
        public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public String toString(){
        return "\n-Nama \t\t: " + name 
                +"\n-ID \t\t: "+ employeeID
                +"\n-Department\t: " + department
                +"\n-Gaji\t\t: " + gaji;
    }
}
