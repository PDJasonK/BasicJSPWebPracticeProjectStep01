package websocket;

@ServerEndpoint("ChatingServer")
public class ChatServer {
	private static Set<Session> clients = Collection.synchronizedSet(new HashSet<Session>());

	@OnOpen
	public void onOpen(Session session) {
		clients.add(session);
		System.out.println("웹소켓 연결:" + session.getId());

	}

	@OnMessage
	public void onMessage(String message, Session session) throws IOException {

		System.out.println("메세지정송 : " + session.getId() + ":" + message);
		synchronized (clients) {
			for (Session client : clients) {
				if (!client.equals(session)) {
					client.getBasicRemote().sendText(message);
				}
			}
		}
	}

	@OnClose
	public void onClose(Session session) {
		clients.remove(session);
		System.out.println("웹소켓 종료 : " + session.getId());
	}

	@OnError
	public void onError(Throwable e) {
		System.out.println("에러발생");
		e.printStackTrace();

	}
}
