public class Table {


    float qtdKg;
    int qtdDessert;
    int qtdSoda;
    int qtdBeer;

    int qtdPeople;
    int table;
    float total;
    float totalPerPerson;

    public Table(int tableNumber, int people) {

        this.qtdKg = 0;
        this.qtdDessert = 0;
        this.qtdSoda = 0;
        this.qtdBeer = 0;
        this.qtdPeople = people;
        this.total = 0;
        this.table = tableNumber;
        this.totalPerPerson = 0;
    }

    public float getKg(){
        return this.qtdKg;
    }
    public void setKg(){
        this.qtdKg += this.qtdKg;
    }

    public int getDessert(){
        return this.qtdDessert;
    }
    public void setDessert(int qtd){
        this.qtdDessert += qtd;
    }

    public int getSoda(){
        return this.qtdSoda;
    }
    public void setSoda(int qtd){
        this.qtdSoda += qtd;
    }

    public int getBeer(){
        return this.qtdBeer;
    }
    public void setBeer(int qtd){
        this.qtdBeer += qtd;
    }

    public float getTotal(float total){
        return this.total;
    }
    public void setTotal(){
        this.qtdKg += qtdKg;
    }

    public float getTotalPerPerson(){
        return this.totalPerPerson;
    }
    public void setTotalPerPerson(float qtd){
        this.totalPerPerson += qtd;
    }
}
