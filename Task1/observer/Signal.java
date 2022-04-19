package Task1.observer;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class Signal {
	private final int SAMPLING = 1000;
	
	private List<SignalObserver> observers = new ArrayList<SignalObserver>();

	public void addSignalObserver(SignalObserver so) {
		observers.add(so);
	}
	private Sampler sampler = new DefaultSampler();
	
	public void setTheSampler(Sampler s) {
		sampler = s;
	}
	public Signal(){
		Timer t = new Timer(SAMPLING, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double amplitude = sampler.read();
				for(SignalObserver so : observers)
					so.updateSignal(amplitude);
			}
		});
		t.start();
	}	
}