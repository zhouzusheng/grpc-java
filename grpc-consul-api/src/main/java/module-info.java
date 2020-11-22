open module grpc.consul.api {
    requires com.google.gson;

    exports com.ecwid.consul;
    exports com.ecwid.consul.json;
    exports com.ecwid.consul.transport;
    exports com.ecwid.consul.v1;
    exports com.ecwid.consul.v1.acl;
    exports com.ecwid.consul.v1.acl.model;
    exports com.ecwid.consul.v1.agent;
    exports com.ecwid.consul.v1.agent.model;
    exports com.ecwid.consul.v1.catalog;
    exports com.ecwid.consul.v1.catalog.model;
    exports com.ecwid.consul.v1.coordinate;
    exports com.ecwid.consul.v1.coordinate.model;
    exports com.ecwid.consul.v1.event;
    exports com.ecwid.consul.v1.event.model;
    exports com.ecwid.consul.v1.health;
    exports com.ecwid.consul.v1.health.model;
    exports com.ecwid.consul.v1.kv;
    exports com.ecwid.consul.v1.kv.model;
    exports com.ecwid.consul.v1.query;
    exports com.ecwid.consul.v1.query.model;
    exports com.ecwid.consul.v1.session;
    exports com.ecwid.consul.v1.session.model;
    exports com.ecwid.consul.v1.status;
}