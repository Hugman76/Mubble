package hugman.mod.objects.state.properties;

import net.minecraft.util.IStringSerializable;

public enum SlabVerticalType implements IStringSerializable
{
	NORTH("north"),
	SOUTH("south"),
	EAST("east"),
	WEST("west"),
	DOUBLE("double");

	private final String name;

	private SlabVerticalType(String name)
	{
		this.name = name;
	}

	public String toString()
	{
		return this.name;
	}

	public String getName()
	{
		return this.name;
	}
}
