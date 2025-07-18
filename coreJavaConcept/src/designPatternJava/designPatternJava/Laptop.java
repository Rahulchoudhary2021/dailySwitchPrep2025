package designPatternJava.designPatternJava;

public class Laptop {

	// Required field....
	private String company;
	private String processor;

	// optional fields....
	private String ram;
	private String graphics;
	private String mouse;
	private String headphone;

	// create private constructor...
	private Laptop(builder builder) {
		this.company = builder.company;
		this.processor = builder.processor;
		this.ram = builder.ram;
		this.graphics = builder.graphics;
		this.mouse = builder.mouse;
		this.headphone = builder.headphone;
	}

	public static class builder {
		// Required field....
		private String company;
		private String processor;

		// optional fields....
		private String ram;
		private String graphics;
		private String mouse;
		private String headphone;

		public builder(String company, String processor) {
			this.company = company;
			this.processor = processor;
		}

		public builder ram(String ram) {
			this.ram = ram;
			return this;
		}

		public builder graphics(String graphics) {
			this.graphics = graphics;
			return this;
		}

		public builder mouse(String mouse) {
			this.mouse = mouse;
			return this;
		}

		public builder headphone(String headphone) {
			this.headphone = headphone;
			return this;
		}
		
		public Laptop build() {
			return new Laptop(this);
		}
	}
		@Override
		public String toString() {
			return "builder [company=" + company + ", processor=" + processor + ", ram=" + ram + ", graphics="
					+ graphics + ", mouse=" + mouse + ", headphone=" + headphone + "]";
		}

	}

