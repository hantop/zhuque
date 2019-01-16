/*
 * Copyright 2017-2019 The OpenAds Project
 *
 * The OpenAds Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package ai.houyi.zhuque.core.model.query;

import org.apache.commons.lang3.StringUtils;

import ai.houyi.zhuque.commons.SQLUtils;
import ai.houyi.zhuque.commons.model.PageQueryReq;
import ai.houyi.zhuque.dao.model.UserExample;

/**
 * @author weiping wang
 *
 */
public class UserQueryReq extends PageQueryReq<UserExample> {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public UserExample toExample() {
		UserExample example = new UserExample();
		example.setOffset(getOffset());
		example.setRows(pageSize);

		if (StringUtils.isNotBlank(name))
			example.createCriteria().andNameLike(SQLUtils.toLikeString(name));
		
		return example;
	}
}
