package ex0327.interfaceEx;

public class Tv extends Elec implements ElecFunction {
	int channel;

	public Tv() {}
	public Tv(int channel) {
		this.channel = channel;		
	}
	public Tv(String code, int cost, int channel) {
		super(code, cost);
		this.channel = channel;		
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(code);
		builder.append("제품 TV를 ");
		builder.append(channel);
		builder.append("을 본다.");
		return builder.toString();
	}
}
