/**
 * 
 */
package com.dianping.pigeon.remoting.provider.config;

/**
 * @author xiangwu
 * 
 */
public class ProviderMethodConfig {

	private String name;

	private int actives = 0;

	private PoolConfig poolConfig;

	public PoolConfig getPoolConfig() {
		return poolConfig;
	}

	public void setPoolConfig(PoolConfig poolConfig) {
		this.poolConfig = poolConfig;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getActives() {
		return actives;
	}

	public void setActives(int actives) {
		this.actives = actives;
	}

}
