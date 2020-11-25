import java.util.List;

public class Order  {
    private List<Order> nume;
    Integer cantitate;
    Float pret;

    public Order(List <Order> nume){
        this.nume = nume;
        this.cantitate = cantitate;
        this.pret = pret;

    }

    public List<Order> getNume() {
        return nume;
    }


    public Integer getCantitate(){
        return this.cantitate;
    }

    public Float getPret(){
        return this.pret;
    }


    public void setNume(List<Order> nume) {
        this.nume = nume;
    }

    public void setCantitate(Integer cantitate){
        this.cantitate = cantitate;
    }

    public void setPret(Float pret){
        this.pret = pret;
    }

    public String toString(){

        return cantitate + "x" + nume + "x" + pret;
    }

}
