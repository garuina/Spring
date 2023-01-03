package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ltv")
public class LgTV implements TV {
	
	
	@Autowired
	private Speaker speaker;
	
	
	public void powerOn() {
		System.out.println("LgTv powerOn...");
	};
	public void powerOff() {
		System.out.println("LgTv powerOff...");
	};
	
	public void chUp() {
		System.out.println("LgTv chUp...");
	};
	public void chDown() {
		System.out.println("LgTv chDown...");
	};
	
	public void soundUp() {
		speaker.soundUp();
	};
	public void soundDown() {
		speaker.soundDown();
	};
}
