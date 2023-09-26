package day19oopDeneme;

public class CivicDeneme implements AcDeneme, EngineDeneme,SecurityDeneme{
    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }//Extence yerine interfacelerde implement kullanırız

    @Override
    public void run() {//Bunun hangi teyzeden (Parent) geldiğinin bir önemi yok zaten farklı birşey eklenemez aynı
        System.out.println("Ac runs super");
    }


}
