package gamelogic.keys;

import org.lwjgl.util.vector.Vector3f;

import entities.Camera;

public class DKey extends AbstractKey {

	public DKey(int id, Camera camera) {
		super(id, camera);
	}

	@Override
	public void run() {
		Camera camera = super.getCamera();
		Vector3f position = camera.getPosition();
		position.x += 0.02f;
		camera.setPosition(position);
	}

}