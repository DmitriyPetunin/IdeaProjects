package ru.itis.inf304.probnik;

public class Main {
    public static void main(String[] args) {
        Client client_1 = new Client("Игорь",Gender.Male,Discount.student);
        Client client_2 = new Client("Сергей",Gender.Male);
        Client client_3 = new Client("Лилия",Gender.Female);

        Povar povar_1 = new Povar("Фёдор");
        Povar povar_2 = new Povar("Ваня");

        Order order_1 = new Order(client_1,povar_1,Pizza.Маргарита,OrderStatus.Заказан,5,Data.декабрь);
    }
}
