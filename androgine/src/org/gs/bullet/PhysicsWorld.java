/*
Bullet Continuous Collision Detection and Physics Library for Android NDK
Copyright (c) 2006-2009 Noritsuna Imamura  http://www.siprop.org/

This software is provided 'as-is', without any express or implied warranty.
In no event will the authors be held liable for any damages arising from the use of this software.
Permission is granted to anyone to use this software for any purpose,
including commercial applications, and to alter it and redistribute it freely,
subject to the following restrictions:

1. The origin of this software must not be misrepresented; you must not claim that you wrote the original software. If you use this software in a product, an acknowledgment in the product documentation would be appreciated but is not required.
2. Altered source versions must be plainly marked as such, and must not be misrepresented as being the original software.
3. This notice may not be removed or altered from any source distribution.
*/
package org.gs.bullet;

import org.gs.bullet.interfaces.DynamicsWorld;
import org.gs.bullet.interfaces.Solver;
import org.gs.bullet.util.Vector3;

public class PhysicsWorld {

	public int id = 0;
	
	public CollisionConfiguration cllisionConfiguration;
	public CollisionDispatcher collisionDispatcher;
	public Solver solver;
	public DynamicsWorld dynamicsWorld;
	public Vector3 worldAabbMin;
	public Vector3 worldAabbMax;
	public int maxProxies;
	public Vector3 gravity;
	
}
