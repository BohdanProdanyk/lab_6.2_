public class Class {
    public static void main(String[] args) {
        Apartment Kiev = new Apartment("Київ","Шевченківський район");
        Apartment Lviv = new Apartment("Львів","Сихівський район");
        Apartment Kharkiv = new Apartment("Харків","Новобаварський район");
        Kiev.map();

        Data kievdata = new Data(9,2, 56,"on");
        Data kievdata1 = new Data(2,1, 40.5,"off");
        Data lvivdata = new Data(2,1, 36.9,"off");
        Data lvivdata1 = new Data(7,3, 97,"on");
        Data kharkivdata = new Data(3,2, 46,"on");
        kievdata.ploshcha_one();

        Furniture Kievf = new Furniture("Мікрохвильовка, чайник, духовка, посудомийка, мультиварка, холодильник", 6 ,"Двохспальне ліжко, телевізор,дві тумбочки, зеркало",5,"ванна, стіральна машина", 2 ,"Вішалака, тумбочка для взутя",2, "on");
        Furniture Kievf1 = new Furniture("Мікрохвильовка, електро чайник, духовка, посудомийка, холодильник",5,"Односпальне ліжко,одна тумбочка, зеркало",3, "Бойлер, душ, стіральна машина",3,"Вішалка, крісло", 2, "on");
        Furniture Lvivf = new Furniture("Мікрохвильовка, електро чайник, духовка, посудомийка, мультиварка, холодильник",6,"Односпальне ліжко, телевізор,одна тумбочка",3, "душ, стіральна машина",2,"Вішалка, крісло",2, "on");
        Furniture Lvivf1 = new Furniture("Мікрохвильовка, чайник, духовка, посудомийка, холодильник",5,"Двохспальне ліжко, телевізор,дві тумбочки, зеркало",5, "Бойлер, душ/ванна, стіральна машина",3,"Вішалака, тумбочка для взутя",2, "off");
        Furniture Kharkivf = new Furniture("Мікрохвильовка,електро чайник, духовка, посудомийка, холодильник",5,"Двохспальне ліжко, телевізор,дві тумбочки",4, "Бойлер, душ/ванна, стіральна машина",3,"Вішалака, тумбочка для взутя", 2,"on");
        Kievf.sum();

    }
}
