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
package ai.houyi.zhuque.core;

import java.io.Serializable;
import java.util.List;

import ai.houyi.zhuque.commons.page.Page;

/**
 * @author weiping wang
 */
public interface BaseService<T, Example,PK extends Serializable> {
	void save(T t);

	void update(T t);
	
	void deleteById(PK pk);
	
	T loadById(PK pk);
	
	List<T> selectByExample(Example example);
	
	Page<T> selectPageByExample(Example example);
}
