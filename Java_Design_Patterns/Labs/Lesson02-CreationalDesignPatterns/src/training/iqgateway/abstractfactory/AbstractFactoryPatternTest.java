/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.abstractfactory;

/**
 *
 * @author sai.krishna
 */
public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        WorkStation lapRef = WorkStationFactory.getWorkStation(new LapTopFactory("8 gb", "420 ssd", "2.4 ghz"));
        System.out.println(lapRef.toString());
        WorkStation serverRef = WorkStationFactory.getWorkStation(new ServerFactory("8 gb", "420 ssd", "2.4 ghz"));
        System.out.println(serverRef);

    }
            
}
