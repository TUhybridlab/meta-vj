DESCRIPTION = "Virtual Jump Simulator control server"
HOMEPAGE = "jumpcu.be"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f93075c1428685cef952d61fa0baf5aa"
DEPENDS = ""

SRC_URI = "git://github.com/j-be/vj-control-server.git;user=git;protocol=ssh;branch=master"

RDEPENDS_${PN} = "python \
                  python-logging \
                  python-ctypes \
                  python-pyserial \
                  python-recordclass \
                  python-flask-socketio \
"

S = "${WORKDIR}/git"
SRCREV = "${AUTOREV}"

DEST_DIR = "/opt/vj-control-server"

# Package Revision, Update this whenever you change the recipe.
PR = "r19"

inherit update-rc.d

do_install () {
  install -d ${D}${DEST_DIR}

  install -d ${D}${DEST_DIR}/static
  cp -a ${S}/static/* ${D}${DEST_DIR}/static/

  install -m 0555 ${S}/vj-control-server.py ${D}${DEST_DIR}
  install -m 0555 ${S}/vj_serial.py ${D}${DEST_DIR}
  install -m 0444 ${S}/log.ini ${D}${DEST_DIR}

  install -d ${D}${sysconfdir}/init.d
  install -m 0755 ${S}/vj-control-server.init ${D}${sysconfdir}/init.d/vj-control-server

  chown -R root:root ${D}${DEST_DIR}
}

FILES_${PN} += "${DEST_DIR}/* ${DEST_DIR}/*/* ${DEST_DIR}/*/*/*"

INITSCRIPT_NAME = "vj-control-server"
INITSCRIPT_PARAMS = "defaults 92 20"

# Avoid splitting the package
PKG_SPLIT_INHIBIT="1"
