package test;
import javax.swing.*;   
// Swing컴넌트의 공통 속성을 구현한 추상클래스. 스윙 GUI 프로그램을 만기 위해 필요.

import java.awt.Dimension;
//Dimension은 특정 영역의 사각형, 폭과 높이의 값을 관리할 수 있도록 도와주는 클래스.

import java.awt.Toolkit;
//눈에 보이는 그래픽을 처리할 수 있게 해주는 클래스.

public class HelloWorldGUIApp{
    public static void main(String[] args){
    	// 프로그램의 메인 진입점!
    	
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	// 이벤트 디스매치 스레드에서 실행되는 코드. 
            	// 이벤트 디스매치 스레드는 Java Swing 과 관련되어 있다.
            	
                JFrame frame = new JFrame("HelloWorld GUI");
                // JFrame은 GUI 애플리케이션의 창을 나타내는 최상위 컨테이너.
                
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // 프레임의 기본 종료 동작을 설정하여 창이 닫힐 때 애플리케이션이 종료될 수 있게 한다.
                
                frame.setPreferredSize(new Dimension(400, 600));
                // 실행시 뜨는 창의 크기를 조절한다. 첫번째 함수에는 너비, 두번째 함수에는 높이. 단위는 픽셀.
                
                JLabel label = new JLabel("Hello World!!", SwingConstants.CENTER);
                // JLabel은 단일 줄의 읽기 전용 텍스트나 이미지를 표시하는 컴포넌트입니다.
                
                frame.getContentPane().add(label);
                // 레이블 컴포넌트를 프레임의 콘텐트 팬에 추가한다.
                // 콘텐트 팬은 주요 GUI 컴포넌트가 추가되는 곳이다.
                
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                // 사용자 디스플레이의 화면 크기를 가져온다.
                
                frame.setLocation(dim.width/2-400/2, dim.height/2-600/2);
                // 프레임의 위치를 화면 중앙에 설정하도록 한다.
                // 화면 크기와 프레임의 크기를 기반으로 x와 y 좌표를 계산한다.

                frame.pack();
                frame.setVisible(true);
                // 프레임을 화면에 출력한다!
            }
        });
    }
}