package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;
    // 싱글톤 패턴
    // 한 프로그램에서 단 하나의 객체만 존재해야할때
    // 생성자를 private로 설정하면 새로운 객체생성이 불가능하기 때문에
    // getInstance()를 통해 객체를 할당받게 되고
    // 따라서 동일한 객체를 계속 할당받게 된다.
    private SocketClient(){

    }

    public static SocketClient getInstance(){

        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }
    public void connect(){
        System.out.println("connect");

    }
}
