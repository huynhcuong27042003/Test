public class PS {
    private int tu, mau;
 
    public PS(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }
     
     public int getTu() {
        return tu;
    }
 
    public void setTu(int tu) {
        this.tu = tu;
    }
 
    public int getMau() {
        return mau;
    }
 
    public void setMau(int mau) {
        this.mau = mau;
    }
 
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
     
    public void Rutgon() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
     
    public void Cong(PS ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PS Cong = new PS(ts, ms);
        Cong.Rutgon();
        System.out.println("Tong = " + Cong.tu + "/" + Cong.mau);
    }
      
    public void Tru(PS ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        PS Hieu = new PS(ts, ms);
        Hieu.Rutgon();
        System.out.println("Hieu = " + Hieu.tu + "/" + Hieu.mau);
    }
     
    public void Nhan(PS ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        PS Tich = new PS(ts, ms);
        Tich.Rutgon();
        System.out.println("Tich = " + Tich.tu + "/" + Tich.mau);
    }
     
    public void Chia(PS ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        PS Thuong = new PS(ts, ms);
        Thuong.Rutgon();
        System.out.println("Thuong = " + Thuong.tu + "/" + Thuong.mau);
    }
     
}
