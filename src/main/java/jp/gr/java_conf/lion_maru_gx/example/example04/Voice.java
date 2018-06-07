package jp.gr.java_conf.lion_maru_gx.example.example04;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Voice {
	@Min(0)@Max(127)
	private short param1 = 0;
	private short param2 = 0;
	private short param3 = 0;
	/**
	 * param1を取得します。
	 * @return param1
	 */
	public short getParam1() {
	    return param1;
	}
	/**
	 * param1を設定します。
	 * @param param1 param1
	 */
	public void setParam1(short param1) {
	    this.param1 = param1;
	}
	/**
	 * param2を取得します。
	 * @return param2
	 */
	public short getParam2() {
	    return param2;
	}
	/**
	 * param2を設定します。
	 * @param param2 param2
	 */
	public void setParam2(short param2) {
	    this.param2 = param2;
	}
	/**
	 * param3を取得します。
	 * @return param3
	 */
	public short getParam3() {
	    return param3;
	}
	/**
	 * param3を設定します。
	 * @param param3 param3
	 */
	public void setParam3(short param3) {
	    this.param3 = param3;
	}

}
