package DataPegawai2;
/**
 *
 * @author G.Kristha
 * Program by : Gerardus Kristha_215314004
 */
public class KantorCabang {
    public static final int MAX_PEGAWAI = 100;
    private String kodeCabang;
    private String alamat;
    private String kota;
    private Pegawai pimpinan;
    private int jumlahPegawai;
    private Pegawai [] pegawaiArray;
    
    public KantorCabang(){
        this("", "", "");
    }
    public KantorCabang(String kodeCabang, String alamat, String kota){
      this.kodeCabang = kodeCabang;
      this.alamat = alamat;
      this.kota = kota;
    }

    public String getKodeCabang() {
        return kodeCabang;
    }

    public void setKodeCabang(String kodeCabang) {
        this.kodeCabang = kodeCabang;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public Pegawai getPimpinan() {
        return pimpinan;
    }

    public void setPimpinan(Pegawai pimpinan) {
        this.pimpinan = pimpinan;
    }

    public int getJumlahPegawai() {
        return pegawaiArray.length;
    }
    
    public Pegawai[] getPegawaiArray() {
        return pegawaiArray;
    }

    public void setPegawaiArray(Pegawai[] pegawaiArray,int jumlahPegawai) {
        this.pegawaiArray = pegawaiArray;
        this.jumlahPegawai = jumlahPegawai;
    }
    
    public Pegawai findPegawai(int id ){
        for(int i = 0 ; i<jumlahPegawai;i++){
                if(pegawaiArray[i].getEmployeeID()==id){
                    return pegawaiArray[i];
                }
            }
        System.out.println("Tidak Ditemukan");
        return new Pegawai();
        }
    
    public Pegawai findPegawai(String nama ){
        for(int i = 0 ; i<jumlahPegawai;i++){
                if(pegawaiArray[i].getName().equalsIgnoreCase(nama)){
                   return pegawaiArray[i];
                }
            }
        System.out.println("Tidak Ditemukan");
        return new Pegawai ();
        }
        
    public void addPegawai (Pegawai addPegawai){
        if(jumlahPegawai<MAX_PEGAWAI){
            this.pegawaiArray[jumlahPegawai]=addPegawai;
            jumlahPegawai++;
        }else System.out.println("Data pegawai maksimal kapasitas");
    }
    
    public void removePegawai (int posisiData){
        this.pegawaiArray[posisiData-1]= pegawaiArray[jumlahPegawai-1];
        pegawaiArray[jumlahPegawai-1]=null;
        jumlahPegawai--;
    }
    
    public Pegawai getPegawaiGajiTerkecil (){
        Pegawai min = pegawaiArray[0];
        for(int i=0; i<jumlahPegawai;i++){
            if(pegawaiArray[i].getGaji()<min.getGaji()){
                min=pegawaiArray[i];
            }
        }
        return min;
    }
    
        public Pegawai getPegawaiGajiTerbesar (){
        Pegawai max = pegawaiArray[0];
        for(int i=0; i<jumlahPegawai;i++){
            if(pegawaiArray[i].getGaji()>max.getGaji()){
                max=pegawaiArray[i];
            }
        }
        return max;
    }
        
    public String toString(){
        String print="\n------------------------------\n"
                +"\t Data Pegawai \t"+"\n- Kode Kantor Cabang : "+kodeCabang+ " -";
        for(int i=0;i<jumlahPegawai;i++){
            print+="\nPegawai "+ (i+1)
                    +pegawaiArray[i].toString()+"\n";
        }
        print+="";
        return print;
                
    }
}
