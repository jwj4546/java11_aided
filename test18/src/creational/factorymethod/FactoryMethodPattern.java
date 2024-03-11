package creational.factorymethod;

public class FactoryMethodPattern {
	public static void main(String[] args) {
			Factory factory = new IDCardFactory();
			Product card1 = factory.create("장인범");
			Product card2 = factory.create("강범준");
			card1.use();
			card2.use();
	}
}
