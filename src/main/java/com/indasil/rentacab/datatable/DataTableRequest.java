package com.indasil.rentacab.datatable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vashishta on 11/18/2014.
 */
public class DataTableRequest implements Serializable {
    private List<DataTableColumn> columns = new ArrayList<DataTableColumn>();
    private String token;
    private Integer length;
    private List<SortColumnDirection> order = new ArrayList<SortColumnDirection>();
    private DataTableSearchFilter search = new DataTableSearchFilter();
    private Integer start;
    private String draw;

    private String entityState;

    public String getEntityState() {
        return entityState;
    }

    public void setEntityState(String entityState) {
        this.entityState = entityState;
    }

    public DataTableRequest() {

    }
    // database usage only


    public List<DataTableColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<DataTableColumn> columns) {
        this.columns = columns;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public List<SortColumnDirection> getOrder() {
        return order;
    }

    public void setOrder(List<SortColumnDirection> order) {
        this.order = order;
    }

    public DataTableSearchFilter getSearch() {
        return search;
    }

    public void setSearch(DataTableSearchFilter search) {
        this.search = search;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public String getDraw() {
        return draw;
    }

    public void setDraw(String draw) {
        this.draw = draw;
    }
}
