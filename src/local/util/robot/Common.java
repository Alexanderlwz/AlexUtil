/**
 * CopyRight (C) 1989-2989 <Alexander>
 * Copy Right Author     : Alexander_LWZ
 * Package Space         : local.util.robot
 * JDK Version Used      : jdk1.7.0_45
 * Comments              : The common methods for Robot
 * Version               : 1.0.0
 * Create Date           : 2014.2.7
 * Modification History  
 * Sr Date       Why & What is modified
 */

package local.util.robot;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Common {
	//
	private static final int PRESSDELAY = 10;

	/**
	 * Move mouse to the target point and Click the left button
	 * 
	 * @param r
	 * @param x
	 *            point.x
	 * @param y
	 *            point.y
	 * @param delay
	 *            The sleep time after action
	 */
	public static void clickLMouse(Robot r, int x, int y, int delay) {
		r.mouseMove(x, y);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.delay(PRESSDELAY);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.delay(delay);

	}

	/**
	 * Move mouse to the target point and Click the right button
	 * 
	 * @param r
	 * @param x
	 *            point.x
	 * @param y
	 *            point.y
	 * @param delay
	 *            The sleep time after action
	 */
	public static void clickRMouse(Robot r, int x, int y, int delay) {
		r.mouseMove(x, y);
		r.mousePress(InputEvent.BUTTON3_MASK);
		r.delay(PRESSDELAY);
		r.mouseRelease(InputEvent.BUTTON3_MASK);
		r.delay(delay);

	}

	/**
	 * Press keys from an array of input words
	 * 
	 * @param r
	 * @param ks
	 *            the array of input keys
	 * @param delay
	 *            The sleep time after action
	 */
	public static void pressKeys(Robot r, int[] ks, int delay) {
		for (int i = 0; i < ks.length; i++) {
			r.keyPress(ks[i]);
			r.delay(PRESSDELAY);
			r.keyRelease(ks[i]);
			r.delay(PRESSDELAY * 2);
		}
		r.delay(delay);
	}

	public static void altTab(Robot r) {
		r.keyPress(KeyEvent.VK_ALT);
		r.delay(PRESSDELAY);
		r.keyPress(KeyEvent.VK_TAB);
		r.delay(PRESSDELAY);
		r.keyRelease(KeyEvent.VK_ALT);
		r.delay(PRESSDELAY);
		r.keyRelease(KeyEvent.VK_TAB);
		r.delay(PRESSDELAY * 2);
	}

	public static void closeApplication(Robot r) {
		r.keyPress(KeyEvent.VK_ALT);
		r.delay(PRESSDELAY);
		r.keyPress(KeyEvent.VK_F4);
		r.delay(PRESSDELAY);
		r.keyRelease(KeyEvent.VK_ALT);
		r.delay(PRESSDELAY);
		r.keyRelease(KeyEvent.VK_F4);
		r.delay(PRESSDELAY * 2);
		r.keyPress(KeyEvent.VK_N);
		r.delay(PRESSDELAY);
		r.keyRelease(KeyEvent.VK_N);
		r.delay(PRESSDELAY * 2);
	}

	/**
	 * 复制
	 * 
	 * @param r
	 * @throws InterruptedException
	 */
	void doCopy(Robot r) throws InterruptedException {
		Thread.sleep(3000);
		r.setAutoDelay(200);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}

	/**
	 * 粘贴
	 * 
	 * @param r
	 * @throws InterruptedException
	 */
	void doParse(Robot r) throws InterruptedException {
		r.setAutoDelay(500);
		Thread.sleep(2000);
		r.mouseMove(300, 300);
		r.mousePress(InputEvent.BUTTON1_MASK);
		r.mouseRelease(InputEvent.BUTTON1_MASK);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

	/**
	 * 捕捉全屏慕
	 * 
	 * @param r
	 * @return
	 */
	public Icon captureFullScreen(Robot r) {
		BufferedImage fullScreenImage = r.createScreenCapture(new Rectangle(
				Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIcon icon = new ImageIcon(fullScreenImage);
		return icon;
	}

	/**
	 * 捕捉屏幕的一个矫形区域
	 * 
	 * @param r
	 * @param x
	 *            x坐标位置
	 * @param y
	 *            y坐标位置
	 * @param width
	 *            矩形的宽
	 * @param height
	 *            矩形的高
	 * @return
	 */
	public Icon capturePartScreen(Robot r, int x, int y, int width, int height) {
		r.mouseMove(x, y);
		BufferedImage fullScreenImage = r.createScreenCapture(new Rectangle(
				width, height));
		ImageIcon icon = new ImageIcon(fullScreenImage);
		return icon;
	}

}
