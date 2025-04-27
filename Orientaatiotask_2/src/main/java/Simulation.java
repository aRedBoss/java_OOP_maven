public class Simulation {
    private EventList eventList;

    public Simulation() {
        eventList = new EventList();
    }

    public void run() {
        // Initialize with an ARRIVAL event
        eventList.addEvent(new Event(1, EventType.ARRIVAL, "Y"));  // Y-type client arriving at time 1
        eventList.addEvent(new Event(2, EventType.ARRIVAL, "X"));  // Another client arriving at time 2

        while (eventList.hasEvents()) {
            Event event = eventList.getNextEvent();

            // Process the next event
            System.out.println("Processing: " + event);

            switch (event.getEventType()) {
                case ARRIVAL:
                    // After arrival, schedule a service event
                    int serviceTime = event.getTime() + 2;  // Service time after 2 units
                    eventList.addEvent(new Event(serviceTime, EventType.SERVICE, event.getClientType()));
                    break;

                case SERVICE:
                    // After service, schedule an exit event
                    int exitTime = event.getTime() + 1;  // Exit time after 1 unit
                    eventList.addEvent(new Event(exitTime, EventType.EXIT, event.getClientType()));
                    break;

                case EXIT:
                    // Client has exited, check if it's the Y-type client and stop the simulation
                    if ("Y".equals(event.getClientType())) {
                        System.out.println("Client Y has exited the system. Stopping simulation.");
                        return;  // End the simulation when client Y exits
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.run();
    }
}
