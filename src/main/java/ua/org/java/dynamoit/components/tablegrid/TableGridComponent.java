/*
 * This file is part of DynamoIt.
 *
 *     DynamoIt is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Foobar is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with DynamoIt.  If not, see <https://www.gnu.org/licenses/>.
 */

package ua.org.java.dynamoit.components.tablegrid;

import dagger.BindsInstance;
import dagger.Component;
import ua.org.java.dynamoit.EventBus;
import ua.org.java.dynamoit.MainModel;
import ua.org.java.dynamoit.db.DynamoDBModule;

import javax.inject.Singleton;

@Component(modules = {TableGridModule.class, DynamoDBModule.class})
@Singleton
public interface TableGridComponent {

    TableGridView view();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder mainModel(MainModel mainModel);
        @BindsInstance
        Builder eventBus(EventBus eventBus);
        @BindsInstance
        Builder tableContext(TableGridContext context);
        TableGridComponent build();
    }

}
