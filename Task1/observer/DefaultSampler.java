package Task1.observer;

public class DefaultSampler implements Sampler {

	@Override
	public double read() {
		return Math.random() * 10;
	}

}
