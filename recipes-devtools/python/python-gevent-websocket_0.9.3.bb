SUMMARY = "Websocket handler for the gevent pywsgi server"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9b6d0dda2588c549e606f5b0acadeb1b"

RDEPENDS_${PN} = "python-gevent"

SRC_URI[md5sum] = "eb59f931d60e068e95adecefaed54df7"
SRC_URI[sha256sum] = "6475220340f9f8895a0f51bd2b9df3511bc7765dc055f49e997584bdaee3381f"

PR = "r3"

inherit pypi
