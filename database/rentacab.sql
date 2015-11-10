--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5beta1
-- Dumped by pg_dump version 9.5beta1

-- Started on 2015-11-10 17:15:34 EST

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE rentacab;
--
-- TOC entry 2390 (class 1262 OID 21788)
-- Name: rentacab; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE rentacab WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'C' LC_CTYPE = 'C';


ALTER DATABASE rentacab OWNER TO postgres;

\connect rentacab

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 5 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO postgres;

--
-- TOC entry 2391 (class 0 OID 0)
-- Dependencies: 5
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


--
-- TOC entry 184 (class 3079 OID 12623)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2393 (class 0 OID 0)
-- Dependencies: 184
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 180 (class 1259 OID 21789)
-- Name: authority; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE authority (
    authority_id integer NOT NULL,
    value character varying(50) NOT NULL
);


ALTER TABLE authority OWNER TO postgres;

--
-- TOC entry 183 (class 1259 OID 21811)
-- Name: cab; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE cab (
    id integer NOT NULL,
    vehicle_model character varying(100) NOT NULL
);


ALTER TABLE cab OWNER TO postgres;

--
-- TOC entry 182 (class 1259 OID 21801)
-- Name: user_authorities; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE user_authorities (
    user_id integer NOT NULL,
    authority_id integer NOT NULL
);


ALTER TABLE user_authorities OWNER TO postgres;

--
-- TOC entry 181 (class 1259 OID 21795)
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE users (
    id integer NOT NULL,
    username character varying(50) NOT NULL,
    password character varying(50) NOT NULL,
    enabled integer NOT NULL
);


ALTER TABLE users OWNER TO postgres;

--
-- TOC entry 2382 (class 0 OID 21789)
-- Dependencies: 180
-- Data for Name: authority; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO authority VALUES (1, 'ROLE_ADMIN');
INSERT INTO authority VALUES (2, 'ROLE_USER');


--
-- TOC entry 2385 (class 0 OID 21811)
-- Dependencies: 183
-- Data for Name: cab; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO cab VALUES (1, 'Honda');
INSERT INTO cab VALUES (2, 'Toyota');
INSERT INTO cab VALUES (3, 'Dodge');
INSERT INTO cab VALUES (4, 'Nissan');
INSERT INTO cab VALUES (5, 'Hyundai');
INSERT INTO cab VALUES (6, 'Chevy');
INSERT INTO cab VALUES (7, 'Ford');
INSERT INTO cab VALUES (8, 'GM');
INSERT INTO cab VALUES (9, 'Jeep');
INSERT INTO cab VALUES (10, 'Rover');
INSERT INTO cab VALUES (11, 'BMW');


--
-- TOC entry 2384 (class 0 OID 21801)
-- Dependencies: 182
-- Data for Name: user_authorities; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO user_authorities VALUES (1, 1);
INSERT INTO user_authorities VALUES (1, 2);


--
-- TOC entry 2383 (class 0 OID 21795)
-- Dependencies: 181
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO users VALUES (1, 'admin', 'password', 1);


--
-- TOC entry 2258 (class 2606 OID 21793)
-- Name: authority_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY authority
    ADD CONSTRAINT authority_pkey PRIMARY KEY (authority_id);


--
-- TOC entry 2266 (class 2606 OID 21815)
-- Name: cab_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY cab
    ADD CONSTRAINT cab_pkey PRIMARY KEY (id);


--
-- TOC entry 2262 (class 2606 OID 21799)
-- Name: users_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY users
    ADD CONSTRAINT users_pkey PRIMARY KEY (id);


--
-- TOC entry 2263 (class 1259 OID 21810)
-- Name: fk_authorities; Type: INDEX; Schema: public; Owner: postgres
--

CREATE INDEX fk_authorities ON user_authorities USING btree (authority_id);


--
-- TOC entry 2264 (class 1259 OID 21809)
-- Name: ix_auth_username; Type: INDEX; Schema: public; Owner: postgres
--

CREATE UNIQUE INDEX ix_auth_username ON user_authorities USING btree (user_id, authority_id);


--
-- TOC entry 2259 (class 1259 OID 21794)
-- Name: ix_unq_auth_value; Type: INDEX; Schema: public; Owner: postgres
--

CREATE UNIQUE INDEX ix_unq_auth_value ON authority USING btree (value);


--
-- TOC entry 2260 (class 1259 OID 21800)
-- Name: ix_username; Type: INDEX; Schema: public; Owner: postgres
--

CREATE UNIQUE INDEX ix_username ON users USING btree (username);


--
-- TOC entry 2267 (class 2606 OID 21804)
-- Name: user_authorities_authority_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY user_authorities
    ADD CONSTRAINT user_authorities_authority_id_fkey FOREIGN KEY (authority_id) REFERENCES authority(authority_id);


--
-- TOC entry 2392 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2015-11-10 17:15:34 EST

--
-- PostgreSQL database dump complete
--

