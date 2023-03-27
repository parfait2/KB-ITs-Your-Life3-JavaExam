package ex0327.interfaceEx;

public class Audio extends Elec implements ElecFunction {
	int volume;

	public Audio() {}

	public Audio(int volume) {
		this.volume = volume;
	}
	
	public Audio(String code, int cost, int volume) {
		super(code, cost);
		this.volume = volume;
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
		builder.append("의 Audio를 ");
		builder.append(volume);
		builder.append("으로 듣는다.");
		return builder.toString();
	}
}
