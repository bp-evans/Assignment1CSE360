package cse360assignment02;

public class AddingMachineTest {
	public static void main(String[] args) {
		AddingMachine machine = new AddingMachine();
		machine.add(4);
		machine.subtract(2);
		machine.add(5);
		System.out.println(machine.toString());
		System.out.println("Total = " + machine.getTotal());
	}
}
