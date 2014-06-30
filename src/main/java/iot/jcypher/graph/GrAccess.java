/************************************************************************
 * Copyright (c) 2014 IoT-Solutions e.U.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ************************************************************************/

package iot.jcypher.graph;

import java.util.List;

import iot.jcypher.graph.internal.ChangeListener;
import iot.jcypher.graph.internal.GrId;
import iot.jcypher.result.util.ResultHandler;

public class GrAccess {

	public static GrNode createNode(ResultHandler rh, GrId id, int rowIdx) {
		return new GrNode(rh, id, rowIdx);
	}
	
	public static GrRelation createRelation(ResultHandler rh, GrId id,
			GrId startNodeId, GrId endNodeId, int rowIdx) {
		return new GrRelation(rh, id, startNodeId, endNodeId, rowIdx);
	}
	
	public static GrPath createPath(ResultHandler rh,
			GrId startNodeId, GrId endNodeId, List<GrId> relIds, int rowIdx) {
		return new GrPath(rh, startNodeId, endNodeId, relIds, rowIdx);
	}
	
	public static GrProperty createProperty(String name) {
		return new GrProperty(name);
	}
	
	public static GrLabel createLabel(String name) {
		return new GrLabel(name);
	}
	
	public static Graph createGraph(ResultHandler resultHandler) {
		return new Graph(resultHandler);
	}
	
	public static void setState(PersistableItem item, SyncState state) {
		item.setSyncState(state);
	}
	
	public static SyncState getState(PersistableItem item) {
		return item.getSyncState();
	}
	
	public static void setGraphState(Graph graph, SyncState state) {
		graph.setSyncState(state);
	}
	
	public static SyncState getGraphState(Graph graph) {
		return graph.getSyncState();
	}
	
	public static void addChangeListener(ChangeListener listener, PersistableItem item) {
		item.addChangeListener(listener);
	}
	
	public static void removeChangeListener(ChangeListener listener, PersistableItem item) {
		item.removeChangeListener(listener);
	}
}
