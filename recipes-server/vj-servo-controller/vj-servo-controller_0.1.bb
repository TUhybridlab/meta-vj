DESCRIPTION = "Virtual Jump Simulator Maxon servo control server"
HOMEPAGE = "jumpcu.be"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=038a301e5fa71c8df7a6afedcbd17608"

SRC_URI = "git://github.com/j-be/vj-servo-controller.git;user=git;protocol=ssh"

RDEPENDS_${PN} = "python \
                  python-logging \
                  python-threading \
                  python-Flask \
                  python-Flask-SocketIO \
                  python-pyserial \
                  python-recordclass \
                  python-ctypes \
                  libEposCmd \
"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEST_DIR = "/opt/vj-servo-controller"

# Package Revision, Update this whenever you change the recipe.
PR = "r1"

inherit update-rc.d

do_install () {
  install -d ${D}${DEST_DIR}

  install -d ${D}${DEST_DIR}/static
  cp -a ${S}/static/* ${D}${DEST_DIR}/static/

  install -m 0444 ${S}/epos_lib_wrapper.py ${D}${DEST_DIR}
  install -m 0444 ${S}/position_fetcher.py ${D}${DEST_DIR}
  install -m 0555 ${S}/epos_control_server.py ${D}${DEST_DIR}
  install -m 0444 ${S}/log.ini ${D}${DEST_DIR}

  install -d ${D}${sysconfdir}/init.d
  install -m 0755 ${S}/vj-servo-controller.init ${D}${sysconfdir}/init.d/vj-servo-controller

  chown -R root:root ${D}${DEST_DIR}
}

FILES_${PN} += "${DEST_DIR}/* ${DEST_DIR}/*/* ${DEST_DIR}/*/*/*"

INITSCRIPT_NAME = "${PN}"
INITSCRIPT_PARAMS = "defaults 92 20"

# Avoid splitting the package
PKG_SPLIT_INHIBIT="1"
