package com.company;

public class Main {

    public static void main(String[] args) {
        //Utworzenie 1. obowiazku - tylko nazwa
        Duty duty1 = new DutyBuilder("Sprzątanie").build();

        //Utworzenie 2. obowiazku - nazwa, dzien
        Duty duty2 = new DutyBuilder("Patroszenie karpia").setExecutionDay(22).build();
        //Utworzenie 3. obowiazku - nazwa, dzien, osoba;
        Duty duty3 = new DutyBuilder("Malowanie ścian na czerwono").setExecutionDay(4).setPersonAssigned("Pan Wiesio").build();
        //Utworzenie 4. obowiazku - nazwa, dzien, czas;
        Duty duty4 = new DutyBuilder("Granie na organkach").setExecutionDay(12).setTimeNeeded(1).build();
        //Utworzenie 5. obowiazku - wszystkie pola;
        Duty duty5 = new DutyBuilder("Mycie podłóg").setExecutionDay(21).setTimeNeeded(3).setPersonAssigned("Piotr Ziemniak").build();


        //Utworzenie 6. obowiazku - nazwa, czas
        Duty duty6 = new DutyBuilder("Bieganie, coby schudnąć przed świętami").setTimeNeeded(2).build();
        //Utworzenie 7. obowiazku - nazwa, wykonawca
        Duty duty7 = new DutyBuilder("Mycie okien").setPersonAssigned("Pan Tadeusz").build();
        //Utworzenie 8. obowiazku - cazwa, czas, wykonawca
        Duty duty8 = new DutyBuilder("Drzemka").setTimeNeeded(12).setPersonAssigned("Tomasz Szymaniak").build();

        //Utworzenie 9. obowiazku - obowiazek przypadajacy w wigilie
        Duty duty9 = new DutyBuilder("Zakup opłatków").setExecutionDay(24).setTimeNeeded(1).setPersonAssigned("Jan Kowalski").build();

        //Nagła potrzeba - pakowanie prezentów w wigilię
        Emergency emergency = new Emergency(new DutyBuilder("Pakowanie prezentów").setExecutionDay(24).setTimeNeeded(4).setPersonAssigned("Swiety Mikołaj").build());

        //Nagła potrzeba - pakowanie prezentów w wigilię
        Emergency emergency2 = new Emergency(new DutyBuilder("Emergency na dzień inny").setExecutionDay(21).setTimeNeeded(4).setPersonAssigned("Swiety Mikołaj").build());

        executeDuties(duty1, duty2, duty3, duty4, duty5, duty6, duty7, duty8, duty9, emergency, emergency2);
    }

    private static void executeDuties(Duty ... duties){
        DutyVisitor dutyVisitor = new DutyVisitor();
        dutyVisitor.executeDuties(duties);
    }
}
