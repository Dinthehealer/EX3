/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;

/**
 *
 * @author sarun
 */
public class ScheduleServer {
    public void startBooting(){
	System.out.println("Starts booting...");
        readSystemConfigFile();
    }
    public void readSystemConfigFile(){
        System.out.println("Reading system config files...");
        init();
    }
    public void init(){
	System.out.println("Initializing...");
        initializeContext();
    }
    public void initializeContext(){
	System.out.println("Initializing context...");
        initializeListeners();
    }
    public void initializeListeners(){
	System.out.println("Initializing listeners...");
        createSystemObjects();
    }
    public void createSystemObjects(){
        System.out.println("Creating system objects...");
    }
    public void releaseProcesses(){
        System.out.println("Releasing processes...");
        destory();
    }
    public void destory(){
        System.out.println("Destorying...");
        destroySystemObjects();
    }
    public void destroySystemObjects(){
	System.out.println("Destroying system objects...");
        destoryListeners();
    }
    public void destoryListeners(){
        System.out.println("Destroying listeners...");
        destoryContext();
    }
    public void destoryContext(){
        System.out.println("Destroying context...");
        shutdown();
    }
    public void shutdown(){
        System.out.println("Shutting down...");
    }
}
