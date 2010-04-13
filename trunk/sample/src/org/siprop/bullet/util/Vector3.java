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
package org.siprop.bullet.util;

public class Vector3 {
	
	public float x;
	public float y;
	public float z;
	
	public Vector3() {
		
	}
	public Vector3(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public Vector3(float[] mat) {
		if(mat.length >= 3) {
			this.x = mat[0];
			this.y = mat[1];
			this.z = mat[2];
		}
	}
	
	public void mul(float mul) {
		x = x*mul;
		y = y*mul;
		z = z*mul;
	}
	public void div(float div) {
		x = x/div;
		y = y/div;
		z = z/div;
	}
}