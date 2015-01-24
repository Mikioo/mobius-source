/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package quests;

import lineage2.gameserver.enums.Race;
import lineage2.gameserver.scripts.ScriptFile;

public class Q10342_DayOfDestinyElvenFate extends SagasSuperclass implements ScriptFile
{
	private static final int questId = 10342;
	
	public Q10342_DayOfDestinyElvenFate()
	{
		super(false);
		StartNPC = 30856;
		StartRace = Race.elf;
		init();
	}
	
	@Override
	public int questId()
	{
		return questId;
	}
	
	@Override
	public void onLoad()
	{
	}
	
	@Override
	public void onReload()
	{
	}
	
	@Override
	public void onShutdown()
	{
	}
}