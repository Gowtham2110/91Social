package main.converter;

import main.CyclePricingRuntimeException;
import main.model.ComponentPart;
import main.model.Cycle;
import main.model.CycleParts;
import main.model.chainAssembly.ChainAssembly;
import main.model.frame.Frame;
import main.model.frame.FrameComponent;
import main.model.handleBarComponents.HandleBarComponents;
import main.model.seating.Seating;
import main.model.wheel.Wheel;

public class InputCriteriaConveter {

	private Cycle cycle = null;
	private Wheel wheel = null;
	private Frame frame = null;
	private Seating seating = null;
	private ChainAssembly chainAssembly = null;
	private HandleBarComponents handleBar = null;

	//	Converts Input Criteria to corresponding its Object Class
	public void convertInputCriteriaToModel (String input) {
		if(input == null) return;

		String[] constituentPartsList  = input.split(",", -1);

		for (String constituentPart : constituentPartsList) {
			ComponentPart component;
			Integer noOfComponents = 1;

			switch(constituentPart.toUpperCase()) {

			case "BREAK":
				if (this.getHandleBar() == null) {
					this.setHandleBar(new HandleBarComponents());
				}

				if(getHandleBar().getBrake() != null) {
					noOfComponents = getHandleBar().getBrake().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.BREAK, noOfComponents);
				getHandleBar().setBrake(component);

				break;

			case "FORK":
				if (this.getHandleBar() == null) {
					this.setHandleBar(new HandleBarComponents());
				}

				if(getHandleBar().getFork() != null) {
					noOfComponents = getHandleBar().getFork().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.FORK, noOfComponents);
				getHandleBar().setFork(component);

				break;

			case "GEARCONTROL":
				if (this.getHandleBar() == null) {
					this.setHandleBar(new HandleBarComponents());
				}

				if(getHandleBar().getGearControl() != null) {
					noOfComponents = getHandleBar().getGearControl().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.GEARCONTROL, noOfComponents);
				getHandleBar().setGearControl(component);

				break;

			case "HANDLEBARGRIP":
				if (this.getHandleBar() == null) {
					this.setHandleBar(new HandleBarComponents());
				}

				if(getHandleBar().getHandleBarGrip() != null) {
					noOfComponents = getHandleBar().getHandleBarGrip().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.HANDLEBARGRIP, noOfComponents);
				getHandleBar().setHandleBarGrip(component);

				break;

			case "HEADTUBE":
				if (this.getHandleBar() == null) {
					this.setHandleBar(new HandleBarComponents());
				}

				if(getHandleBar().getHeadTube() != null) {
					noOfComponents = getHandleBar().getHeadTube().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.HEADTUBE, noOfComponents);
				getHandleBar().setHeadTube(component);

				break;

			case "SHOCKABSORBER":
				if (this.getHandleBar() == null) {
					this.setHandleBar(new HandleBarComponents());
				}

				if(getHandleBar().getGearControl() != null) {
					noOfComponents = getHandleBar().getGearControl().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.GEARCONTROL, noOfComponents);
				getHandleBar().setShockAbsorber(component);
				break;

			case "CHAIN":
				if (this.getChainAssembly() == null) {
					this.setChainAssembly(new ChainAssembly());
				}

				if(getChainAssembly().getChain() != null) {
					noOfComponents = getChainAssembly().getChain().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.CHAIN, noOfComponents);
				getChainAssembly().setChain(component);
				break;

			case "CRANKARM":
				if (this.getChainAssembly() == null) {
					this.setChainAssembly(new ChainAssembly());
				}

				if(getChainAssembly().getCrankArm() != null) {
					noOfComponents = getChainAssembly().getCrankArm().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.CRANKARM, noOfComponents);
				getChainAssembly().setCrankArm(component);
				break;

			case "GEAR":
				if (this.getChainAssembly() == null) {
					this.setChainAssembly(new ChainAssembly());
				}

				if(getChainAssembly().getGear() != null) {
					noOfComponents = getChainAssembly().getGear().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.GEAR, noOfComponents);
				getChainAssembly().setGear(component);
				break;

			case "PEDAL":
				if (this.getChainAssembly() == null) {
					this.setChainAssembly(new ChainAssembly());
				}

				if(getChainAssembly().getPedal() != null) {
					noOfComponents = getChainAssembly().getPedal().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.PEDAL, noOfComponents);
				getChainAssembly().setPedal(component);
				break;

			case "CHAINSTAY":
				if (this.getFrame() == null) {
					this.setFrame(new Frame());
				}

				if(getFrame().getChainStay() != null) {
					noOfComponents = getFrame().getChainStay().getComponent().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.FRAME, noOfComponents);

				//	Default chain stay length is 5.0
				FrameComponent chainStay = new FrameComponent(5.0, component);
				getFrame().setChainStay(chainStay);
				break;

			case "DOWNTUBE":
				if (this.getFrame() == null) {
					this.setFrame(new Frame());
				}

				if(getFrame().getDownTube() != null) {
					noOfComponents = getFrame().getDownTube().getComponent().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.FRAME, noOfComponents);

				//	Default down stay length is 4.0
				FrameComponent downTube = new FrameComponent(4.0, component);
				getFrame().setDownTube(downTube);
				break;

			case "SEATSTAY":
				if (this.getFrame() == null) {
					this.setFrame(new Frame());
				}

				if(getFrame().getSeatStay() != null) {
					noOfComponents = getFrame().getSeatStay().getComponent().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.FRAME, noOfComponents);

				//	Default seat stay length is 2.5
				FrameComponent seatStay = new FrameComponent(2.5, component);
				getFrame().setSeatStay(seatStay);
				break;

			case "SEATTUBE":
				if (this.getFrame() == null) {
					this.setFrame(new Frame());
				}

				if(getFrame().getSeatTube() != null) {
					noOfComponents = getFrame().getSeatTube().getComponent().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.FRAME, noOfComponents);

				//	Default Seat tube length is 7.0
				FrameComponent seatTube = new FrameComponent(7.0, component);
				getFrame().setSeatTube(seatTube);
				break;

			case "TOPTUBE":
				if (this.getFrame() == null) {
					this.setFrame(new Frame());
				}

				if(getFrame().getTopTube() != null) {
					noOfComponents = getFrame().getTopTube().getComponent().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.FRAME, noOfComponents);

				//	Default top tube length is 5.5
				FrameComponent topTube = new FrameComponent(5.5, component);
				getFrame().setTopTube(topTube);
				break;

			case "SADDLE":
				if (this.getSeating() == null) {
					this.setSeating(new Seating());
				}

				if(getSeating().getSaddle() != null) {
					noOfComponents = getSeating().getSaddle().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.SADDLE, noOfComponents);
				getSeating().setSaddle(component);
				break;

			case "SEATPOST":
				if (this.getSeating() == null) {
					this.setSeating(new Seating());
				}

				if(getSeating().getSeatPost() != null) {
					noOfComponents = getSeating().getSeatPost().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.SEATPOST, noOfComponents);
				getSeating().setSeatPost(component);
				break;

			case "SPOKES":
				if (this.getWheel() == null) {
					this.setWheel(new Wheel());
				}

				if(getWheel().getSpokes() != null) {
					noOfComponents = getWheel().getSpokes().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.SPOKES, noOfComponents);
				getWheel().setSpokes(component);
				break;

			case "RIM":
				if (this.getWheel() == null) {
					this.setWheel(new Wheel());
				}

				if(getWheel().getRim() != null) {
					noOfComponents = getWheel().getRim().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.RIM, noOfComponents);
				getWheel().setRim(component);
				break;

			case "TUBELESSTUBE":
				if (this.getWheel() == null) {
					this.setWheel(new Wheel());
				}

				if(getWheel().getTube() != null) {
					noOfComponents = getWheel().getTube().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.TUBELESSTUBE, noOfComponents);
				getWheel().setTube(component);
				break;

			case "TUBE":
				if (this.getWheel() == null) {
					this.setWheel(new Wheel());
				}

				if(getWheel().getTube() != null) {
					noOfComponents = getWheel().getTube().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.TUBE, noOfComponents);
				getWheel().setTube(component);
				break;

			case "TYRE":
				if (this.getWheel() == null) {
					this.setWheel(new Wheel());
				}

				if(getWheel().getTyre() != null) {
					noOfComponents = getWheel().getTyre().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.TYRE, noOfComponents);
				getWheel().setTyre(component);
				break;

			case "VALVE":
				if (this.getWheel() == null) {
					this.setWheel(new Wheel());
				}

				if(getWheel().getValve() != null) {
					noOfComponents = getWheel().getValve().getNoOfComponents() + 1;
				}
				component = new ComponentPart(CycleParts.VALVE, noOfComponents);
				getWheel().setValve(component);
				break;

			default:
				String errorMessage = "Please check the spelling of the constituent part " + constituentPart;
				throw new CyclePricingRuntimeException(errorMessage);
			}

		}
		setCycleComponent();
	}

	private void setCycleComponent() {
		Cycle cycle = new Cycle();
		cycle.setChainAssembly(this.getChainAssembly());
		cycle.setFrame(this.getFrame());
		cycle.setHandleBarComponents(this.getHandleBar());
		cycle.setSeating(this.getSeating());
		cycle.setWheel(this.getWheel());

		this.setCycle(cycle);
	}

	public Cycle getCycle() {
		return cycle;
	}

	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public Seating getSeating() {
		return seating;
	}

	public void setSeating(Seating seating) {
		this.seating = seating;
	}

	public HandleBarComponents getHandleBar() {
		return handleBar;
	}

	public void setHandleBar(HandleBarComponents handleBar) {
		this.handleBar = handleBar;
	}

	public ChainAssembly getChainAssembly() {
		return chainAssembly;
	}

	public void setChainAssembly(ChainAssembly chainAssembly) {
		this.chainAssembly = chainAssembly;
	}
}
