package jp.gr.java_conf.lion_maru_gx.example.example04;

import java.util.function.UnaryOperator;

import javafx.scene.control.TextFormatter;
import javafx.util.StringConverter;

public class IntegerTextFormatter extends TextFormatter<Integer> {
	private Integer min = 0;
	private Integer max = 128;

	public IntegerTextFormatter(Integer min,Integer max) {
		super(new IntegerStringConverter(),0,textFormatterFilter());
		this.min = min;
		this.max = max;
	}

	static private UnaryOperator<Change> textFormatterFilter() {
	    return null;
	}

	public static class IntegerStringConverter extends StringConverter<Integer> {

		@Override
		public Integer fromString(String arg0) {
			return Integer.parseInt(arg0);
		}

		@Override
		public String toString(Integer arg0) {
			return arg0.toString();
		}

	}

}
